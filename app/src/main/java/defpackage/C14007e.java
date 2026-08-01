package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14007e {
    public static final C9273e Companion = new Object();
    public static final InterfaceC3477e[] mopub = {null, AbstractC18039e.appmetrica(2, new C13117e(27)), AbstractC18039e.appmetrica(2, new C13117e(28)), null, null, null, null, null, null, null};
    public final String ad;
    public final String adcel;
    public final String appmetrica;
    public final String billing;
    public final int license;
    public final EnumC8519e metrica;
    public final String purchase;
    public final int startapp;
    public final EnumC8519e vip;
    public final String yandex;

    public /* synthetic */ C14007e(int i, String str, EnumC8519e enumC8519e, EnumC8519e enumC8519e2, int i2, String str2, String str3, String str4, String str5, int i3, String str6) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = enumC8519e;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = enumC8519e2;
        }
        if ((i & 8) == 0) {
            this.license = 120;
        } else {
            this.license = i2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str2;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str3;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = str4;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str5;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = 0;
        } else {
            this.startapp = i3;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = null;
        } else {
            this.adcel = str6;
        }
    }
}
