package defpackage;

import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10392e extends AbstractC2228e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC14291e f20542e;

    public AbstractC10392e(String str, AbstractC2228e abstractC2228e, AbstractC14291e abstractC14291e, C17823e c17823e) {
        super(str, abstractC2228e, c17823e);
        AbstractC2301e.billing(abstractC14291e.metrica);
        this.f20542e = abstractC14291e;
    }

    public AbstractC10392e(String str, UUID uuid, String str2, AbstractC14291e abstractC14291e, C17823e c17823e) {
        super(str, uuid, str2, c17823e);
        AbstractC2301e.billing(abstractC14291e.metrica);
        this.f20542e = abstractC14291e;
    }

    @Override // defpackage.InterfaceC4766e
    public final AbstractC14291e billing() {
        return AbstractC14291e.ad(this.f20542e, mopub());
    }
}
