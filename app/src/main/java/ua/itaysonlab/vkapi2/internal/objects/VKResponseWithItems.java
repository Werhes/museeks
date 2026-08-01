package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/internal/objects/VKResponseWithItems;", "T", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VKResponseWithItems<T> {
    public final Object ad;
    public final String appmetrica;
    public final List license;
    public final List metrica;
    public final Integer vip;

    public VKResponseWithItems(Object obj, Integer num, List list, List list2, String str) {
        this.ad = obj;
        this.vip = num;
        this.metrica = list;
        this.license = list2;
        this.appmetrica = str;
    }

    public /* synthetic */ VKResponseWithItems(Object obj, Integer num, List list, List list2, String str, int i) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKResponseWithItems)) {
            return false;
        }
        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
        return AbstractC7890e.billing(this.ad, vKResponseWithItems.ad) && AbstractC7890e.billing(this.vip, vKResponseWithItems.vip) && AbstractC7890e.billing(this.metrica, vKResponseWithItems.metrica) && AbstractC7890e.billing(this.license, vKResponseWithItems.license) && AbstractC7890e.billing(this.appmetrica, vKResponseWithItems.appmetrica);
    }

    public final int hashCode() {
        Object obj = this.ad;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.vip;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.metrica;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.license;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.appmetrica;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKResponseWithItems(items=");
        sb.append(this.ad);
        sb.append(", count=");
        sb.append(this.vip);
        sb.append(", profiles=");
        sb.append(this.metrica);
        sb.append(", groups=");
        sb.append(this.license);
        sb.append(", next_from=");
        return AbstractC4653e.applovin(sb, this.appmetrica, ')');
    }
}
