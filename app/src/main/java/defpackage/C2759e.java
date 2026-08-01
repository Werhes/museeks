package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2759e implements InterfaceC5142e {
    public final C3450e ad;
    public final String vip;

    public C2759e(C3450e c3450e, String str) {
        this.ad = c3450e;
        this.vip = str;
    }

    @Override // defpackage.InterfaceC5142e
    public final Object ad(InterfaceC5374e interfaceC5374e, CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return Integer.valueOf(i);
        }
        final char charAt = charSequence.charAt(i);
        C3450e c3450e = this.ad;
        if (charAt == '-') {
            c3450e.invoke(interfaceC5374e, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (charAt != '+') {
            return new C7883e(i, new Function0() { // from class: eؒ٘ؕ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "Expected " + C2759e.this.vip + " but got " + charAt;
                }
            });
        }
        c3450e.invoke(interfaceC5374e, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }

    public final String toString() {
        return this.vip;
    }
}
