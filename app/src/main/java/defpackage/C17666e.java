package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eََ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17666e {
    public final C12431e ad = new C12431e(0, new C2877e[16]);
    public final C12328e vip = new C12328e(10);

    public boolean ad(C2692e c2692e, InterfaceC0043e interfaceC0043e, C12309e c12309e, boolean z) {
        C12431e c12431e = this.ad;
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((C2877e) objArr[i2]).ad(c2692e, interfaceC0043e, c12309e, z) || z2;
        }
        return z2;
    }

    public void vip(C12309e c12309e) {
        C12431e c12431e = this.ad;
        int i = c12431e.f24868e;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C2877e) c12431e.f24870e[i]).license.vip == 0) {
                c12431e.amazon(i);
            }
        }
    }
}
