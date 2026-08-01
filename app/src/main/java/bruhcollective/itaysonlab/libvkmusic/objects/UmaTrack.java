package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC16049e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC5336e;
import defpackage.AbstractC6731e;
import defpackage.AbstractC7890e;
import defpackage.C15420e;
import defpackage.C16609e;
import defpackage.C4721e;
import defpackage.C4803e;
import defpackage.ExecutorC3603e;
import defpackage.InterfaceC10136e;
import defpackage.InterfaceC14776e;
import defpackage.InterfaceC16260e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC4269e;
import defpackage.InterfaceC5083e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import com.werhes.museeks.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaTrack;", "Leؙٖۛ;", "Leُٟؖ;", "Leّٔ٘;", "Leًَ;", "Leٖٗؑ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UmaTrack extends AbstractC16049e implements InterfaceC4269e, InterfaceC14776e, InterfaceC10136e, InterfaceC16260e {
    public final String Signature;
    public final String ad;
    public final boolean adcel;
    public final int admob;
    public boolean advert;
    public final boolean amazon;
    public final String appmetrica;
    public final UmaArtist billing;
    public final UmaCover license;
    public final boolean loadAd;
    public final String metrica;
    public final boolean mopub;
    public final String pro;
    public final UmaAlbum purchase;
    public final UmaPermissions remoteconfig;
    public boolean smaato;
    public final boolean startapp;
    public final long subscription;
    public final String vip;
    public final List yandex;

    public UmaTrack(String str, String str2, String str3, UmaCover umaCover, String str4, UmaAlbum umaAlbum, UmaArtist umaArtist, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str5, int i, long j, UmaPermissions umaPermissions, String str6) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = umaCover;
        this.appmetrica = str4;
        this.purchase = umaAlbum;
        this.billing = umaArtist;
        this.yandex = list;
        this.startapp = z;
        this.adcel = z2;
        this.mopub = z3;
        this.advert = z4;
        this.smaato = z5;
        this.amazon = z6;
        this.loadAd = z7;
        this.Signature = str5;
        this.admob = i;
        this.subscription = j;
        this.remoteconfig = umaPermissions;
        this.pro = str6;
    }

    @Override // defpackage.InterfaceC14776e
    public final boolean ad() {
        return this.amazon || !this.remoteconfig.ad;
    }

    @Override // defpackage.InterfaceC10136e
    /* renamed from: adcel, reason: from getter */
    public final boolean getPurchase() {
        return this.advert;
    }

    @Override // defpackage.AbstractC16049e
    public final C4721e admob() {
        return new C4721e("uma", this.ad, this.appmetrica);
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: advert, reason: from getter */
    public final String getAd() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC16049e
    public final int amazon() {
        return this.admob * 1000;
    }

    @Override // defpackage.InterfaceC16260e
    /* renamed from: billing, reason: from getter */
    public final boolean getInmobi() {
        return this.smaato;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return UmaTrack.class.equals(obj != null ? obj.getClass() : null) && AbstractC7890e.billing(this.ad, ((UmaTrack) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: loadAd, reason: from getter */
    public final String getAd() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC10136e
    public final void metrica(boolean z) {
        this.advert = z;
        int i = 1;
        C16609e c16609e = new C16609e(this.ad, z, 1);
        VKXApplication vKXApplication = VKXApplication.f36528e;
        InterfaceC5083e interfaceC5083e = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(vKXApplication, ExecutorC3603e.f8134e, 0, new C4803e(c16609e, interfaceC5083e, i), 2);
    }

    @Override // defpackage.AbstractC16049e
    public final String mopub() {
        String str;
        UmaAlbum umaAlbum = this.purchase;
        return (umaAlbum == null || (str = umaAlbum.ad) == null) ? BuildConfig.FLAVOR : str;
    }

    @Override // defpackage.AbstractC16049e
    public final String remoteconfig() {
        return "uma";
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: smaato */
    public final String getLicense() {
        return this.license.metrica;
    }

    @Override // defpackage.InterfaceC16260e
    public final void startapp(boolean z) {
        this.smaato = z;
        C16609e c16609e = new C16609e(this.ad, z, 0);
        VKXApplication vKXApplication = VKXApplication.f36528e;
        InterfaceC5083e interfaceC5083e = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(vKXApplication, ExecutorC3603e.f8134e, 0, new C4803e(c16609e, interfaceC5083e, 1), 2);
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: subscription, reason: from getter */
    public final String getVip() {
        return this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaTrack(apiId=");
        sb.append(this.ad);
        sb.append(", name=");
        sb.append(this.vip);
        sb.append(", artistDisplayName=");
        sb.append(this.metrica);
        sb.append(", cover=");
        sb.append(this.license);
        sb.append(", file=");
        sb.append(this.appmetrica);
        sb.append(", album=");
        sb.append(this.purchase);
        sb.append(", artist=");
        sb.append(this.billing);
        sb.append(", artists=");
        sb.append(this.yandex);
        sb.append(", isLegal=");
        sb.append(this.startapp);
        sb.append(", isRadioCapable=");
        sb.append(this.adcel);
        sb.append(", isAdded=");
        sb.append(this.mopub);
        sb.append(", isLiked=");
        sb.append(this.advert);
        sb.append(", isDisliked=");
        sb.append(this.smaato);
        sb.append(", isRestricted=");
        sb.append(this.amazon);
        sb.append(", isExplicit=");
        sb.append(this.loadAd);
        sb.append(", shareHash=");
        sb.append(this.Signature);
        sb.append(", duration=");
        sb.append(this.admob);
        sb.append(", size=");
        sb.append(this.subscription);
        sb.append(", permissions=");
        sb.append(this.remoteconfig);
        sb.append(", vkAudioId=");
        return AbstractC4653e.applovin(sb, this.pro, ')');
    }

    @Override // defpackage.InterfaceC4269e
    /* renamed from: yandex, reason: from getter */
    public final boolean getBilling() {
        return this.loadAd;
    }
}
