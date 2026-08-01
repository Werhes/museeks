# PowerShell script to fix all remaining package name issues
# Run from the code directory

$javaDir = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java"

Write-Host "=== Fix 1: Replace ua.itaysonlab.vkapi2 -> com.werhes.museeks.vkapi2 ===" -ForegroundColor Green
$files1 = Get-ChildItem -Path $javaDir -Recurse -File | Where-Object { $_.Length -gt 0 }
$count1 = 0
foreach ($file in $files1) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "ua\.itaysonlab\.vkapi2") {
        $newContent = $content -replace "ua\.itaysonlab\.vkapi2", "com.werhes.museeks.vkapi2"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $count1++
    }
}
Write-Host "  Replaced in $count1 files" -ForegroundColor Yellow

Write-Host "=== Fix 2: Replace ua.itaysonlab.catalogkit -> com.werhes.museeks.catalogkit ===" -ForegroundColor Green
$count2 = 0
foreach ($file in $files1) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "ua\.itaysonlab\.catalogkit") {
        $newContent = $content -replace "ua\.itaysonlab\.catalogkit", "com.werhes.museeks.catalogkit"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $count2++
    }
}
Write-Host "  Replaced in $count2 files" -ForegroundColor Yellow

Write-Host "=== Fix 3: Replace ua.itaysonlab.itunesutil -> com.werhes.museeks.itunesutil ===" -ForegroundColor Green
$count3 = 0
foreach ($file in $files1) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "ua\.itaysonlab\.itunesutil") {
        $newContent = $content -replace "ua\.itaysonlab\.itunesutil", "com.werhes.museeks.itunesutil"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $count3++
    }
}
Write-Host "  Replaced in $count3 files" -ForegroundColor Yellow

Write-Host "=== Fix 4: Replace com.werhes.museeksreborn -> com.werhes.museeks.vkxreborn ===" -ForegroundColor Green
$count4 = 0
foreach ($file in $files1) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "com\.werhes\.museeksreborn") {
        $newContent = $content -replace "com\.werhes\.museeksreborn", "com.werhes.museeks.vkxreborn"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $count4++
    }
}
Write-Host "  Replaced in $count4 files" -ForegroundColor Yellow

Write-Host "=== Fix 5: Replace VKXApplication -> MuseeksApplication in Java files ===" -ForegroundColor Green
$count5 = 0
foreach ($file in $files1) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "VKXApplication") {
        $newContent = $content -replace "VKXApplication", "MuseeksApplication"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $count5++
    }
}
Write-Host "  Replaced in $count5 files" -ForegroundColor Yellow

Write-Host "=== Fix 6: Rename VKXApplication.java -> MuseeksApplication.java ===" -ForegroundColor Green
$oldPath = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\VKXApplication.java"
$newPath = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\java\com\werhes\museeks\MuseeksApplication.java"
if (Test-Path $oldPath) {
    Rename-Item -Path $oldPath -NewName "MuseeksApplication.java" -Force
    Write-Host "  Renamed VKXApplication.java -> MuseeksApplication.java" -ForegroundColor Yellow
}

Write-Host "=== Fix 7: Replace VKXApplication -> MuseeksApplication in AndroidManifest.xml ===" -ForegroundColor Green
$manifestPath = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\AndroidManifest.xml"
$manifestContent = Get-Content -Path $manifestPath -Raw
if ($manifestContent -match "VKXApplication") {
    $manifestContent = $manifestContent -replace "VKXApplication", "MuseeksApplication"
    Set-Content -Path $manifestPath -Value $manifestContent -NoNewline
    Write-Host "  Replaced VKXApplication in AndroidManifest.xml" -ForegroundColor Yellow
} else {
    Write-Host "  No VKXApplication references found in AndroidManifest.xml (already fixed)" -ForegroundColor Yellow
}

Write-Host "=== Fix 8: Replace VKXApplication -> MuseeksApplication in XML resource files ===" -ForegroundColor Green
$resDir = "c:\Users\Werhes\Downloads\decompiled_apk\code\app\src\main\res"
$xmlFiles = Get-ChildItem -Path $resDir -Recurse -Include "*.xml" | Where-Object { $_.Length -gt 0 }
$count8 = 0
foreach ($file in $xmlFiles) {
    $content = Get-Content -Path $file.FullName -Raw
    if ($content -match "VKXApplication") {
        $newContent = $content -replace "VKXApplication", "MuseeksApplication"
        Set-Content -Path $file.FullName -Value $newContent -NoNewline
        $count8++
    }
}
Write-Host "  Replaced in $count8 XML files" -ForegroundColor Yellow

Write-Host ""
Write-Host "=== Summary ===" -ForegroundColor Green
Write-Host "  vkapi2 replacements: $count1 files"
Write-Host "  catalogkit replacements: $count2 files"
Write-Host "  itunesutil replacements: $count3 files"
Write-Host "  museeksreborn -> vkxreborn: $count4 files"
Write-Host "  VKXApplication -> MuseeksApplication: $count5 files"
Write-Host "  XML VKXApplication replacements: $count8 files"
Write-Host ""
Write-Host "=== All fixes applied! ===" -ForegroundColor Green