package ua.itaysonlab.vkapi2.objects.message;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedAttachment;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConversationAudioElementJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("attachment");
    public final AbstractC13345e vip;

    public ConversationAudioElementJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(NewsfeedAttachment.class, C3295e.f7451e, "attachment");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC3442e.license();
        abstractC3442e.loadAd("attachment");
        this.vip.purchase(abstractC3442e, ((ConversationAudioElement) obj).ad);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ConversationAudioElement)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        NewsfeedAttachment newsfeedAttachment = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("attachment", "attachment", abstractC17080e, set);
                    z = true;
                } else {
                    newsfeedAttachment = (NewsfeedAttachment) vip;
                }
            }
        }
        abstractC17080e.advert();
        if ((newsfeedAttachment == null) & (!z)) {
            set = AbstractC0869e.isPro("attachment", "attachment", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new ConversationAudioElement(newsfeedAttachment);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
