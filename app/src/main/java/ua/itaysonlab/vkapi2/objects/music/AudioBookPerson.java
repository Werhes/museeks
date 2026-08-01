package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC17861e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBookPerson;", "Leُٕؓ;", "AudioBookPersonRole", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioBookPerson implements InterfaceC15377e {
    public final String ad;
    public final List appmetrica;
    public final List license;
    public final String metrica;
    public final Integer vip;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBookPerson$AudioBookPersonRole;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioBookPersonRole {
        public final String ad;

        public AudioBookPersonRole(String str) {
            this.ad = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioBookPersonRole) && AbstractC7890e.billing(this.ad, ((AudioBookPersonRole) obj).ad);
        }

        public final int hashCode() {
            return this.ad.hashCode();
        }

        public final String toString() {
            return AbstractC4653e.applovin(new StringBuilder("AudioBookPersonRole(id="), this.ad, ')');
        }
    }

    public AudioBookPerson(String str, Integer num, String str2, List list, List list2) {
        this.ad = str;
        this.vip = num;
        this.metrica = str2;
        this.license = list;
        this.appmetrica = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookPerson)) {
            return false;
        }
        AudioBookPerson audioBookPerson = (AudioBookPerson) obj;
        return AbstractC7890e.billing(this.ad, audioBookPerson.ad) && AbstractC7890e.billing(this.vip, audioBookPerson.vip) && AbstractC7890e.billing(this.metrica, audioBookPerson.metrica) && AbstractC7890e.billing(this.license, audioBookPerson.license) && AbstractC7890e.billing(this.appmetrica, audioBookPerson.appmetrica);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getAd() {
        return String.valueOf(this.vip);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.vip;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.metrica;
        return this.appmetrica.hashCode() + AbstractC17861e.billing((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.license);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookPerson(description=");
        sb.append(this.ad);
        sb.append(", id=");
        sb.append(this.vip);
        sb.append(", name=");
        sb.append(this.metrica);
        sb.append(", photo=");
        sb.append(this.license);
        sb.append(", roles=");
        return AbstractC1786e.tapsense(sb, this.appmetrica, ')');
    }
}
