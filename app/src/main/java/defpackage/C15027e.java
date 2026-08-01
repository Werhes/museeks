package defpackage;

import android.content.SharedPreferences;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۡٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15027e implements InterfaceC3974e {
    public AudioTrack ad;

    @Override // defpackage.InterfaceC3974e
    public final void ad(AbstractC16049e abstractC16049e, AbstractC16049e abstractC16049e2) {
        if (abstractC16049e instanceof AudioTrack) {
            AudioTrack audioTrack = this.ad;
            if (audioTrack != null) {
                AudioTrack audioTrack2 = (AudioTrack) abstractC16049e;
                if (audioTrack2.metrica == audioTrack.metrica && audioTrack2.vip == audioTrack.vip) {
                    return;
                }
            }
            this.ad = (AudioTrack) abstractC16049e;
            System.currentTimeMillis();
        }
    }

    @Override // defpackage.InterfaceC3974e
    public final void metrica(long j) {
        if (this.ad != null) {
            C15409e.ad.getClass();
            SharedPreferences sharedPreferences = AbstractC16082e.license;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            if (Integer.parseInt(sharedPreferences.getString("autocache", "0")) != 0) {
                AudioTrack audioTrack = this.ad;
                if (j >= 5000) {
                    if (!C5107e.yandex(audioTrack)) {
                        SharedPreferences sharedPreferences2 = AbstractC16082e.license;
                        if (sharedPreferences2 == null) {
                            sharedPreferences2 = null;
                        }
                        int parseInt = Integer.parseInt(sharedPreferences2.getString("autocache", "0"));
                        if (parseInt != 1) {
                            if (parseInt == 2) {
                                C11794e.f23667e.getClass();
                                C2464e.appmetrica.getClass();
                                C2464e.vip(null, audioTrack);
                            }
                        } else if (audioTrack.getAdvert()) {
                            C11794e.f23667e.getClass();
                            C2464e.appmetrica.getClass();
                            C2464e.vip(null, audioTrack);
                        }
                    }
                    this.ad = null;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3974e
    public final void vip(EnumC11342e enumC11342e) {
        if (enumC11342e == EnumC11342e.f22810e) {
            this.ad = null;
        }
    }
}
