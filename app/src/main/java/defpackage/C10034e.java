package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10034e extends AbstractC18469e implements InterfaceC16902e {
    public final AbstractC16397e ad;
    public final boolean license;
    public final String metrica;
    public final Annotation[] vip;

    public C10034e(AbstractC16397e abstractC16397e, Annotation[] annotationArr, String str, boolean z) {
        this.ad = abstractC16397e;
        this.vip = annotationArr;
        this.metrica = str;
        this.license = z;
    }

    @Override // defpackage.InterfaceC16902e
    public final Collection getAnnotations() {
        return AbstractC0014e.startapp(this.vip);
    }

    @Override // defpackage.InterfaceC16902e
    public final C2430e license(C12816e c12816e) {
        return AbstractC0014e.yandex(this.vip, c12816e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C10034e.class.getName());
        sb.append(": ");
        sb.append(this.license ? "vararg " : BuildConfig.FLAVOR);
        String str = this.metrica;
        sb.append(str != null ? C0520e.license(str) : null);
        sb.append(": ");
        sb.append(this.ad);
        return sb.toString();
    }
}
