package defpackage;

import java.util.TreeMap;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13077e implements InterfaceC3974e {
    public AbstractC16049e ad;
    public C8419e metrica;
    public long vip;

    public static String appmetrica(AbstractC16049e abstractC16049e) {
        C11425e.ad.getClass();
        if (!((Boolean) C11425e.yandex.ad()).booleanValue() || !(abstractC16049e instanceof AudioTrack)) {
            return abstractC16049e.getVip();
        }
        AudioTrack audioTrack = (AudioTrack) abstractC16049e;
        String str = audioTrack.license;
        String str2 = audioTrack.subscription;
        if ((str2 == null ? BuildConfig.FLAVOR : str2).length() <= 0) {
            return str;
        }
        return str + " (" + str2 + ')';
    }

    public static String license(AbstractC16049e abstractC16049e) {
        C11425e.ad.getClass();
        return (((Boolean) C11425e.startapp.ad()).booleanValue() && (abstractC16049e instanceof AudioTrack)) ? AbstractC6914e.yandex((AudioTrack) abstractC16049e) : abstractC16049e.getMetrica();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC3974e
    public final void ad(AbstractC16049e abstractC16049e, AbstractC16049e abstractC16049e2) {
        if (!AbstractC13461e.purchase(abstractC16049e)) {
            InterfaceC11810e interfaceC11810e = abstractC16049e instanceof InterfaceC11810e ? (InterfaceC11810e) abstractC16049e : null;
            if (interfaceC11810e == null || !interfaceC11810e.vip()) {
                this.ad = abstractC16049e;
                this.vip = System.currentTimeMillis();
                C11425e c11425e = C11425e.ad;
                c11425e.getClass();
                C12309e c12309e = C11425e.billing;
                InterfaceC8614e interfaceC8614e = C11425e.vip[4];
                if (((Boolean) c12309e.tapsense(c11425e)).booleanValue()) {
                    C8419e c8419e = this.metrica;
                    if (c8419e != null) {
                        c8419e.Signature(null);
                    }
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    this.metrica = AbstractC5336e.purchase(vKXApplication, null, 0, new C7914e(this, abstractC16049e, abstractC16049e2, null, 10), 3);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC3974e
    public final void metrica(long j) {
        AbstractC16049e abstractC16049e = this.ad;
        long j2 = 1000;
        long j3 = j / j2;
        long j4 = this.vip;
        C11425e c11425e = C11425e.ad;
        c11425e.getClass();
        C12309e c12309e = C11425e.purchase;
        InterfaceC8614e interfaceC8614e = C11425e.vip[3];
        if (!((Boolean) c12309e.tapsense(c11425e)).booleanValue() || abstractC16049e == 0 || AbstractC13461e.purchase(abstractC16049e)) {
            return;
        }
        InterfaceC11810e interfaceC11810e = abstractC16049e instanceof InterfaceC11810e ? (InterfaceC11810e) abstractC16049e : null;
        if ((interfaceC11810e == null || !interfaceC11810e.vip()) && j3 >= abstractC16049e.amazon() / 2000) {
            String license = license(abstractC16049e);
            String appmetrica = appmetrica(abstractC16049e);
            long amazon = abstractC16049e.amazon() / 1000;
            abstractC16049e.getAd();
            String mopub = abstractC16049e.mopub();
            AbstractC8561e.ad();
            String string = AbstractC8561e.ad.getString("sessionKey", null);
            if (j4 == 0) {
                j4 = System.currentTimeMillis();
            }
            long j5 = j4 / j2;
            if (string != null) {
                TreeMap treeMap = new TreeMap();
                treeMap.put("method", "track.scrobble");
                treeMap.put("api_key", "4085c85b9f48c43c0d86c4223bbd8458");
                treeMap.put("sk", string);
                treeMap.put("artist[0]", license);
                treeMap.put("track[0]", appmetrica);
                if (mopub != null) {
                    treeMap.put("album[0]", mopub);
                }
                treeMap.put("timestamp[0]", String.valueOf(j5));
                if (amazon != -1) {
                    treeMap.put("duration", String.valueOf(amazon));
                }
                treeMap.put("api_sig", AbstractC8561e.metrica(treeMap));
                treeMap.put("format", "json");
                VKXApplication.Companion companion = VKXApplication.f36531e;
                C1343e ad = AbstractC12918e.ad();
                C18464e c18464e = new C18464e(23);
                c18464e.m4486e("https://ws.audioscrobbler.com/2.0/");
                String vip = AbstractC8561e.vip(treeMap);
                C10445e c10445e = C14133e.license;
                c18464e.m4494e("POST", C6173e.signatures(vip, AbstractC1266e.vip("application/x-www-form-urlencoded")));
                ad.vip(new C8650e(c18464e)).appmetrica(new C8455e(8));
            }
            this.ad = null;
        }
    }

    @Override // defpackage.InterfaceC3974e
    public final void vip(EnumC11342e enumC11342e) {
        if (enumC11342e == EnumC11342e.f22810e) {
            this.ad = null;
            this.vip = 0L;
        }
    }
}
