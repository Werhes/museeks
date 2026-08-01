package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۚۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14226e extends IOException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC6649e f28108e;

    public C14226e(String str) {
        super(str);
        this.f28108e = null;
    }

    public static C14226e vip() {
        return new C14226e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void ad(AbstractC0641e abstractC0641e) {
        this.f28108e = abstractC0641e;
    }
}
