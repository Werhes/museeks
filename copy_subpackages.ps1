# PowerShell script to copy subpackages from sources/ua/itaysonlab/ to com/werhes/museeks/
$SourceBase = "..\sources\ua\itaysonlab"
$TargetBase = "app\src\main\java\com\werhes\museeks"

$Subpackages = @(
    "vkxreborn",
    "vkxnative", 
    "vkxtv",
    "catalogkit",
    "itunesutil",
    "vkapi2"
)

foreach ($pkg in $Subpackages) {
    $SourcePath = Join-Path $SourceBase $pkg
    $TargetPath = Join-Path $TargetBase $pkg
    
    Write-Host "Copying $pkg ..."
    
    if (Test-Path $SourcePath) {
        if (-not (Test-Path $TargetPath)) {
            New-Item -ItemType Directory -Path $TargetPath -Force | Out-Null
        }
        Copy-Item -Path "$SourcePath\*" -Destination $TargetPath -Recurse -Force
        Write-Host "  OK: $pkg copied"
    } else {
        Write-Host "  ERROR: Source not found: $SourcePath"
    }
}

Write-Host ""
Write-Host "All subpackages copied successfully!"