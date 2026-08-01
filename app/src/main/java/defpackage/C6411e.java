package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6411e extends C18511e {
    /* renamed from: final, reason: not valid java name */
    public static Long m2161final(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.C18511e, defpackage.AbstractC11062e
    /* renamed from: goto */
    public final C15308e mo1917goto(C10675e c10675e) {
        C10675e c10675e2;
        Path path = Paths.get(c10675e.f21024e.remoteconfig(), new String[0]);
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = C10675e.f21023e;
                c10675e2 = C10215e.license(readSymbolicLink.toString(), false);
            } else {
                c10675e2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long m2161final = creationTime != null ? m2161final(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long m2161final2 = lastModifiedTime != null ? m2161final(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new C15308e(isRegularFile, isDirectory, c10675e2, valueOf, m2161final, m2161final2, lastAccessTime != null ? m2161final(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.C18511e, defpackage.AbstractC11062e
    public final void license(C10675e c10675e, C10675e c10675e2) {
        try {
            Files.move(Paths.get(c10675e.f21024e.remoteconfig(), new String[0]), Paths.get(c10675e2.f21024e.remoteconfig(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.C18511e
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
