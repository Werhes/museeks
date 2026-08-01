package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۨۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6090e extends AbstractC16947e {
    public final /* synthetic */ Method ad;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ Class vip;

    public C6090e(Method method, Class cls, int i) {
        this.ad = method;
        this.vip = cls;
        this.metrica = i;
    }

    @Override // defpackage.AbstractC16947e
    public final Object adcel() {
        return this.ad.invoke(null, this.vip, Integer.valueOf(this.metrica));
    }

    public final String toString() {
        return this.vip.getName();
    }
}
