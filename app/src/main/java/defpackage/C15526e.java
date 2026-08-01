package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15526e extends AbstractC8918e {
    public final C11467e license;
    public final Set metrica;
    public final Level vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15526e(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = C16629e.purchase;
        this.vip = level;
        this.metrica = C16629e.purchase;
        this.license = C16629e.billing;
    }

    @Override // defpackage.AbstractC8918e
    public final boolean ad(Level level) {
        return true;
    }

    @Override // defpackage.AbstractC8918e
    public final void vip(C6713e c6713e) {
        String str = (String) c6713e.license().smaato(InterfaceC15352e.ad);
        if (str == null) {
            str = this.ad;
        }
        if (str == null) {
            AbstractC3184e abstractC3184e = c6713e.license;
            if (abstractC3184e == null) {
                throw new IllegalStateException("cannot request log site information prior to postProcess()");
            }
            str = abstractC3184e.ad();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        C16629e.license(c6713e, AbstractC14783e.adcel(str), this.vip, this.metrica, this.license);
    }
}
