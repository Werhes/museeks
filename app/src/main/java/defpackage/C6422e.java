package defpackage;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6422e extends SimpleFileVisitor {
    public final /* synthetic */ HashSet ad;

    public C6422e(HashSet hashSet) {
        this.ad = hashSet;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        this.ad.add(C5275e.appmetrica(obj));
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        Path parent = C5275e.appmetrica(obj).getParent();
        if (parent != null) {
            this.ad.add(parent);
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }
}
