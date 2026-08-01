package defpackage;

import android.media.MediaFormat;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14909e implements InterfaceC17077e, InterfaceC0396e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C14909e f29542e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC17077e f29543e;

    @Override // defpackage.InterfaceC0396e
    public final void ad(int i, Object obj) {
        if (i == 7) {
            this.f29543e = (InterfaceC17077e) obj;
        } else if (i == 8) {
            this.f29542e = (C14909e) obj;
        } else if (i == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void license() {
        C14909e c14909e = this.f29542e;
        if (c14909e != null) {
            c14909e.license();
        }
    }

    public final void metrica(long j, float[] fArr) {
        C14909e c14909e = this.f29542e;
        if (c14909e != null) {
            c14909e.metrica(j, fArr);
        }
    }

    @Override // defpackage.InterfaceC17077e
    public final void vip(long j, long j2, C16975e c16975e, MediaFormat mediaFormat) {
        InterfaceC17077e interfaceC17077e = this.f29543e;
        if (interfaceC17077e != null) {
            interfaceC17077e.vip(j, j2, c16975e, mediaFormat);
        }
    }
}
