package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13677e extends AbstractC11358e implements InterfaceC2898e {
    public final Object license;

    public C13677e(Method method, Object obj) {
        super(method, C13664e.f27089e);
        this.license = obj;
    }

    @Override // defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        appmetrica(objArr);
        return this.ad.invoke(this.license, Arrays.copyOf(objArr, objArr.length));
    }
}
