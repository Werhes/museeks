package com.werhes.museeksreborn.playback.util;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C2897e;
import defpackage.C3295e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QueueSaveHolder_VkxMetadataStateJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("queue", "timeline", "data");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public QueueSaveHolder_VkxMetadataStateJsonAdapter(C14172e c14172e) {
        C2897e purchase = AbstractC18453e.purchase(List.class, String.class);
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(purchase, c3295e, "queue");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(Map.class, String.class, AudioTrack.class), c3295e, "data");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        QueueSaveHolder$VkxMetadataState queueSaveHolder$VkxMetadataState = (QueueSaveHolder$VkxMetadataState) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("queue");
        List list = queueSaveHolder$VkxMetadataState.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("timeline");
        abstractC13345e.purchase(abstractC3442e, queueSaveHolder$VkxMetadataState.vip);
        abstractC3442e.loadAd("data");
        this.metrica.purchase(abstractC3442e, queueSaveHolder$VkxMetadataState.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(QueueSaveHolder.VkxMetadataState)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        List list = null;
        Map map = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        List list2 = null;
        while (true) {
            if (!abstractC17080e.Signature()) {
                break;
            }
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("queue", "queue", abstractC17080e, set);
                        z = true;
                    } else {
                        list = (List) vip;
                    }
                } else if (mo2308extends == 1) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("timeline", "timeline", abstractC17080e, set);
                        z2 = true;
                    } else {
                        list2 = (List) vip2;
                    }
                } else if (mo2308extends == 2) {
                    Object vip3 = this.metrica.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("data_", "data", abstractC17080e, set);
                        z3 = true;
                    } else {
                        map = (Map) vip3;
                    }
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if ((!z) & (list == null)) {
            set = AbstractC0869e.isPro("queue", "queue", abstractC17080e, set);
        }
        if ((!z2) & (list2 == null)) {
            set = AbstractC0869e.isPro("timeline", "timeline", abstractC17080e, set);
        }
        if ((!z3) & (map == null)) {
            set = AbstractC0869e.isPro("data_", "data", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new QueueSaveHolder$VkxMetadataState(list, list2, map);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
