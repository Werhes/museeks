package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8829e extends AbstractC16947e {
    public final /* synthetic */ Method ad;
    public final /* synthetic */ Class metrica;
    public final /* synthetic */ Object vip;

    public C8829e(Method method, Object obj, Class cls) {
        this.ad = method;
        this.vip = obj;
        this.metrica = cls;
    }

    @Override // defpackage.AbstractC16947e
    public final Object adcel() {
        return this.ad.invoke(this.vip, this.metrica);
    }

    public final String toString() {
        return this.metrica.getName();
    }
}
