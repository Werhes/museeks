package ua.itaysonlab.vkapi2.objects.message;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConversationPeerJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "type", "local_id");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public ConversationPeerJsonAdapter(C14172e c14172e) {
        Class cls = Long.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(String.class, c3295e, "type");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        ConversationPeer conversationPeer = (ConversationPeer) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        long j = conversationPeer.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.crashlytics(j, abstractC13345e, abstractC3442e, "type");
        this.metrica.purchase(abstractC3442e, conversationPeer.vip);
        abstractC3442e.loadAd("local_id");
        abstractC13345e.purchase(abstractC3442e, Long.valueOf(conversationPeer.metrica));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ConversationPeer)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Long l = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Set set = C3295e.f7451e;
        Long l2 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z = true;
                    } else {
                        l = (Long) vip;
                    }
                } else if (mo2308extends == 1) {
                    Object vip2 = this.metrica.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("type", "type", abstractC17080e, set);
                        z2 = true;
                    } else {
                        str = (String) vip2;
                    }
                } else if (mo2308extends == 2) {
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("local_id", "local_id", abstractC17080e, set);
                        z3 = true;
                    } else {
                        l2 = (Long) vip3;
                    }
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if ((!z) & (l == null)) {
            set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
        }
        if ((!z2) & (str == null)) {
            set = AbstractC0869e.isPro("type", "type", abstractC17080e, set);
        }
        if ((l2 == null) & (!z3)) {
            set = AbstractC0869e.isPro("local_id", "local_id", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new ConversationPeer(str, l.longValue(), l2.longValue());
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
