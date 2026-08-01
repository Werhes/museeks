package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3306e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13621e f7466e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7467e;

    public /* synthetic */ C3306e(C13621e c13621e, int i) {
        this.f7467e = i;
        this.f7466e = c13621e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f7467e;
        C13621e c13621e = this.f7466e;
        switch (i) {
            case 0:
                C9394e c9394e = (C9394e) obj;
                C10983e c10983e = (C10983e) ((C0576e) c13621e.ad.Signature.f23070e).getValue();
                c9394e.setArtwork(c10983e != null ? AbstractC11815e.vip(c10983e.vip) : null);
                return Unit.INSTANCE;
            case 1:
                C2038e c2038e = c13621e.ad;
                C12894e c12894e = c2038e.admob;
                AppActivity appActivity = c2038e.ad;
                C0939e c0939e = c2038e.mopub().ad;
                int ordinal = ((EnumC18308e) obj).ordinal();
                if (ordinal == 0) {
                    appActivity.firebase();
                    appActivity.isVip(new C14398e());
                } else if (ordinal == 1) {
                    C11794e c11794e = C11794e.f23667e;
                    AudioTrack audioTrack = (AudioTrack) c2038e.adcel().vip;
                    c11794e.getClass();
                    C2464e.appmetrica.getClass();
                    C2464e.vip(appActivity, audioTrack);
                    VKXApplication.Companion companion = VKXApplication.f36531e;
                    c12894e.loadAd(VKXApplication.Companion.vip(R.string.sn_track_added_to_cache), c0939e.license + " - " + c0939e.vip);
                } else if (ordinal == 2) {
                    C16985e c16985e = new C16985e(appActivity);
                    C11486e c11486e = (C11486e) c16985e.f26878e;
                    c11486e.license = c11486e.ad.getText(R.string.confirm);
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    c11486e.purchase = (vKXApplication != null ? vKXApplication : null).getString(R.string.cache_remove_desc, c0939e.license, c0939e.vip);
                    c16985e.premium(R.string.remove, new DialogInterfaceOnClickListenerC1458e(c2038e, c0939e, 0));
                    c16985e.ads(R.string.cancel, new DialogInterfaceOnClickListenerC11813e(1));
                    c16985e.isPro();
                } else if (ordinal == 3) {
                    try {
                        AbstractC2745e.vip(appActivity, new C12908e((AudioTrack) c2038e.adcel().vip, 4));
                    } catch (SecurityException unused) {
                        c12894e.loadAd("Ошибка", "Нет разрешения, вы точно дали разрешение \"Память\"?");
                    }
                } else if (ordinal == 4) {
                    new C18128e((AudioTrack) c2038e.adcel().vip).signatures(appActivity);
                } else {
                    if (ordinal != 5) {
                        throw new C14803e(10);
                    }
                    c2038e.smaato(c2038e.adcel());
                }
                c13621e.smaato();
                return Unit.INSTANCE;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                C2038e c2038e2 = c13621e.ad;
                new C7855e((C0160e) ((InterfaceC2558e) c2038e2.subscription.appmetrica.getValue()), num).signatures(c2038e2.ad);
                return Unit.INSTANCE;
        }
    }
}
