package com.werhes.museeksreborn.playback.util;

import defpackage.AbstractC10064e;
import defpackage.AbstractC17861e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkxreborn/playback/util/QueueSaveHolder$VkxMetadataState", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class QueueSaveHolder$VkxMetadataState {
    public final List ad;
    public final Map metrica;
    public final List vip;

    public QueueSaveHolder$VkxMetadataState(List list, List list2, Map map) {
        this.ad = list;
        this.vip = list2;
        this.metrica = map;
    }

    public final LinkedHashMap ad() {
        Map map = this.metrica;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10064e.appmetrica(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AudioTrack.signatures((AudioTrack) entry.getValue(), null, null, null, null, 0, -1, 3));
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueSaveHolder$VkxMetadataState)) {
            return false;
        }
        QueueSaveHolder$VkxMetadataState queueSaveHolder$VkxMetadataState = (QueueSaveHolder$VkxMetadataState) obj;
        return AbstractC7890e.billing(this.ad, queueSaveHolder$VkxMetadataState.ad) && AbstractC7890e.billing(this.vip, queueSaveHolder$VkxMetadataState.vip) && AbstractC7890e.billing(this.metrica, queueSaveHolder$VkxMetadataState.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        return "VkxMetadataState(queue=" + this.ad + ", timeline=" + this.vip + ", data=" + this.metrica + ')';
    }
}
