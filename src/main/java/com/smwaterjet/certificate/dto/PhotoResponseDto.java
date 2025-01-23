package com.smwaterjet.certificate.dto;

import java.time.LocalDateTime;

public record PhotoResponseDto(Long id,
                               String title,
                               Integer year,
                               String filePath,
                               LocalDateTime created_at
                               ) { }
