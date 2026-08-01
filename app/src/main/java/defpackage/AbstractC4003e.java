package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4003e implements InterfaceC9739e {
    public final Member ad;
    public final List license;
    public final Class metrica;
    public final Type vip;

    public AbstractC4003e(Member member, Type type, Class cls, Type[] typeArr) {
        List m670implements;
        this.ad = member;
        this.vip = type;
        this.metrica = cls;
        if (cls != null) {
            C6325e c6325e = new C6325e(2);
            ArrayList arrayList = (ArrayList) c6325e.f13170e;
            c6325e.premium(cls);
            c6325e.subs(typeArr);
            m670implements = AbstractC6874e.startapp(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            m670implements = AbstractC1660e.m670implements(typeArr);
        }
        this.license = m670implements;
    }

    @Override // defpackage.InterfaceC9739e
    public final List ad() {
        return this.license;
    }

    public void appmetrica(Object[] objArr) {
        if (AbstractC9110e.ad(this) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(AbstractC9110e.ad(this));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(AbstractC17861e.smaato(objArr.length, " were provided.", sb));
    }

    @Override // defpackage.InterfaceC9739e
    public final Type inmobi() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC9739e
    public final /* bridge */ boolean metrica() {
        return false;
    }

    public final void purchase(Object obj) {
        if (obj == null || !this.ad.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // defpackage.InterfaceC9739e
    public final Member vip() {
        return this.ad;
    }
}
