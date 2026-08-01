package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11358e implements InterfaceC9739e {
    public final Method ad;
    public final Class metrica;
    public final List vip;

    public AbstractC11358e(Method method, List list) {
        this.ad = method;
        this.vip = list;
        this.metrica = method.getReturnType();
    }

    @Override // defpackage.InterfaceC9739e
    public final List ad() {
        return this.vip;
    }

    public final void appmetrica(Object[] objArr) {
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
        return this.metrica;
    }

    @Override // defpackage.InterfaceC9739e
    public final /* bridge */ boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC9739e
    public final /* bridge */ /* synthetic */ Member vip() {
        return null;
    }
}
