package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15387e extends AbstractC9053e implements InterfaceC0489e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final File f30340e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final FileOutputStream f30341e;

    public C15387e(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f30341e = fileOutputStream;
        this.f30340e = file;
    }

    @Override // defpackage.InterfaceC0489e
    public final File ad() {
        return this.f30340e;
    }
}
