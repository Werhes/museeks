# PowerShell script to replace package name in all source files
# Run this script from the code directory

$javaDir = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java"
$resDir = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\res"
$manifestPath = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\AndroidManifest.xml"

Write-Host "=== Replacing package names in Java files ===" -ForegroundColor Green

# Get all Java files
$javaFiles = Get-ChildItem -Path $javaDir -Recurse -Filter "*.java" | Where-Object { $_.Length -gt 0 }
$count = 0

foreach ($file in $javaFiles) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "ua\.itaysonlab\.vkx") {
        $newContent = $content -replace "ua\.itaysonlab\.vkx", "com.werhes.museeks"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $count++
        if ($count % 100 -eq 0) {
            Write-Host "  Processed $count files..."
        }
    }
}

Write-Host "  Processed $count Java files with replacements" -ForegroundColor Yellow

Write-Host "=== Replacing in XML resource files ===" -ForegroundColor Green

$xmlFiles = Get-ChildItem -Path $resDir -Recurse -Include "*.xml" | Where-Object { $_.Length -gt 0 }
$xmlCount = 0

foreach ($file in $xmlFiles) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "ua\.itaysonlab\.vkx") {
        $newContent = $content -replace "ua\.itaysonlab\.vkx", "com.werhes.museeks"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $xmlCount++
    }
}

Write-Host "  Processed $xmlCount XML files with replacements" -ForegroundColor Yellow

Write-Host "=== Replacing in Kotlin files ===" -ForegroundColor Green

$ktFiles = Get-ChildItem -Path $javaDir -Recurse -Include "*.kt" | Where-Object { $_.Length -gt 0 }
$ktCount = 0

foreach ($file in $ktFiles) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "ua\.itaysonlab\.vkx") {
        $newContent = $content -replace "ua\.itaysonlab\.vkx", "com.werhes.museeks"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $ktCount++
    }
}

Write-Host "  Processed $ktCount Kotlin files with replacements" -ForegroundColor Yellow

Write-Host "=== Renaming package directories ===" -ForegroundColor Green

# Rename ua/itaysonlab/vkx to com/werhes/museeks
$oldVkxPath = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\ua\itaysonlab\vkx"
$newMuseeksPath = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks"

if (Test-Path $oldVkxPath) {
    # Create new directory structure
    New-Item -Path $newMuseeksPath -ItemType Directory -Force | Out-Null
    
    # Move all contents
    Get-ChildItem -Path $oldVkxPath -Recurse | ForEach-Object {
        $relativePath = $_.FullName.Substring($oldVkxPath.Length + 1)
        $newPath = Join-Path $newMuseeksPath $relativePath
        if ($_.PSIsContainer) {
            New-Item -Path $newPath -ItemType Directory -Force | Out-Null
        } else {
            $parentDir = Split-Path $newPath -Parent
            if (-not (Test-Path $parentDir)) {
                New-Item -Path $parentDir -ItemType Directory -Force | Out-Null
            }
            Move-Item -Path $_.FullName -Destination $newPath -Force
        }
    }
    
    # Remove old directories
    Remove-Item -Path "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\ua" -Recurse -Force
    Write-Host "  Renamed ua/itaysonlab/vkx -> com/werhes/museeks" -ForegroundColor Yellow
}

# Also handle vkxreborn and other sub-packages
$oldVkxrebornPath = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\ua\itaysonlab\vkxreborn"
if (Test-Path $oldVkxrebornPath) {
    # These files are already under ua/itaysonlab/vkxreborn which is now under com/werhes/museeks
    # Just ensure the rename happened correctly
    Write-Host "  vkxreborn subpackage handled" -ForegroundColor Yellow
}

Write-Host "=== Done! ===" -ForegroundColor Green
Write-Host "Total: $count Java files, $xmlCount XML files, $ktCount Kotlin files updated" -ForegroundColor Green