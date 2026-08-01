# PowerShell script to rename Vkx* classes to Museeks* in source files
# Run from the code directory

$javaDir = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java"

Write-Host "=== Renaming Vkx classes to Museeks in all Java files ===" -ForegroundColor Green

$replacements = @(
    @{Old = "VkxCastContextProvider"; New = "MuseeksCastContextProvider"},
    @{Old = "VkxTvEntrypoint"; New = "MuseeksTvEntrypoint"},
    @{Old = "VkxArtworkContentProvider"; New = "MuseeksArtworkContentProvider"},
    @{Old = "VkxCarAppService"; New = "MuseeksCarAppService"}
)

$files = Get-ChildItem -Path $javaDir -Recurse -File | Where-Object { $_.Length -gt 0 }

foreach ($repl in $replacements) {
    $count = 0
    foreach ($file in $files) {
        $content = Get-Content -Path $file.FullName -Raw
        if ($content -match $repl.Old) {
            $newContent = $content -replace $repl.Old, $repl.New
            Set-Content -Path $file.FullName -Value $newContent -NoNewline
            $count++
        }
    }
    Write-Host "  $($repl.Old) -> $($repl.New): $count files" -ForegroundColor Yellow
}

Write-Host ""
Write-Host "=== Renaming Java files ===" -ForegroundColor Green

# Rename VkxCastContextProvider.java
$old1 = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\vkxtv\VkxCastContextProvider.java"
$new1 = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\vkxtv\MuseeksCastContextProvider.java"
if (Test-Path $old1) { Rename-Item -Path $old1 -NewName "MuseeksCastContextProvider.java" -Force; Write-Host "  Renamed VkxCastContextProvider.java" -ForegroundColor Yellow }

# Rename VkxTvEntrypoint.java
$old2 = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\vkxtv\VkxTvEntrypoint.java"
$new2 = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\vkxtv\MuseeksTvEntrypoint.java"
if (Test-Path $old2) { Rename-Item -Path $old2 -NewName "MuseeksTvEntrypoint.java" -Force; Write-Host "  Renamed VkxTvEntrypoint.java" -ForegroundColor Yellow }

# Rename VkxArtworkContentProvider.java
$old3 = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\vkxreborn\playback\auto\VkxArtworkContentProvider.java"
$new3 = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\vkxreborn\playback\auto\MuseeksArtworkContentProvider.java"
if (Test-Path $old3) { Rename-Item -Path $old3 -NewName "MuseeksArtworkContentProvider.java" -Force; Write-Host "  Renamed VkxArtworkContentProvider.java" -ForegroundColor Yellow }

# Rename VkxCarAppService.java
$old4 = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\vkxreborn\playback\auto2\VkxCarAppService.java"
$new4 = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\vkxreborn\playback\auto2\MuseeksCarAppService.java"
if (Test-Path $old4) { Rename-Item -Path $old4 -NewName "MuseeksCarAppService.java" -Force; Write-Host "  Renamed VkxCarAppService.java" -ForegroundColor Yellow }

Write-Host ""
Write-Host "=== All Vkx class renames complete! ===" -ForegroundColor Green