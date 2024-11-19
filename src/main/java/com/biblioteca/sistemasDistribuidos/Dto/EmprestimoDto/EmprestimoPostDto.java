package com.biblioteca.sistemasDistribuidos.Dto.EmprestimoDto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record EmprestimoPostDto(@NotNull Long usuarioId,
                                @NotNull Long livroId,
                                @NotNull LocalDate dataLimite) {
}