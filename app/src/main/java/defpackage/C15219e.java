package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15219e implements InterfaceC15277e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C15219e f30119e = new Object();

    @Override // defpackage.InterfaceC15277e
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.InterfaceC15277e
    public final InterfaceC9178e vip(View view, boolean z, long j, float f, float f2, boolean z2, InterfaceC14388e interfaceC14388e, float f3) {
        if (z) {
            return new C17760e(new Magnifier(view));
        }
        long mo494e = interfaceC14388e.mo494e(j);
        float mo497instanceof = interfaceC14388e.mo497instanceof(f);
        float mo497instanceof2 = interfaceC14388e.mo497instanceof(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (mo494e != 9205357640488583168L) {
            builder.setSize(AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (mo494e >> 32))), AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (mo494e & 4294967295L))));
        }
        if (!Float.isNaN(mo497instanceof)) {
            builder.setCornerRadius(mo497instanceof);
        }
        if (!Float.isNaN(mo497instanceof2)) {
            builder.setElevation(mo497instanceof2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new C17760e(builder.build());
    }
}
