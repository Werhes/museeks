package defpackage;

import java.io.File;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17690e extends C13593e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17690e(File file, int i) {
        super(file, (File) null, "Cannot list files in a directory");
        switch (i) {
            case 2:
                super(file, (File) null, "The source file doesn't exist.");
                return;
            default:
                return;
        }
    }
}
