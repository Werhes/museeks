package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؐۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2293e extends AbstractC16947e {
    public final /* synthetic */ int ad = 0;
    public final /* synthetic */ AccessibleObject metrica;
    public final /* synthetic */ Class vip;

    public C2293e(Constructor constructor, Class cls) {
        this.metrica = constructor;
        this.vip = cls;
    }

    public C2293e(Method method, Class cls) {
        this.metrica = method;
        this.vip = cls;
    }

    @Override // defpackage.AbstractC16947e
    public final Object adcel() {
        int i = this.ad;
        AccessibleObject accessibleObject = this.metrica;
        switch (i) {
            case 0:
                return ((Constructor) accessibleObject).newInstance(null);
            default:
                return ((Method) accessibleObject).invoke(null, this.vip, Object.class);
        }
    }

    public final String toString() {
        switch (this.ad) {
            case 0:
                return this.vip.getName();
            default:
                return this.vip.getName();
        }
    }
}
