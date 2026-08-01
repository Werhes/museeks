package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؔۙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2813e {
    public static final C15662e Companion = new Object();
    public static final InterfaceC3477e[] adcel = {null, null, AbstractC18039e.appmetrica(2, new C8462e(9)), null, null, null, null, null, null};
    public final int ad;
    public final String appmetrica;
    public final Double billing;
    public final String license;
    public final List metrica;
    public final Double purchase;
    public final String startapp;
    public final String vip;
    public final Integer yandex;

    public /* synthetic */ C2813e(int i, int i2, String str, List list, String str2, String str3, Double d, Double d2, Integer num, String str4) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C8733e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        if ((i & 4) == 0) {
            this.metrica = C13664e.f27089e;
        } else {
            this.metrica = list;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str3;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = d;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = d2;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = num;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = null;
        } else {
            this.startapp = str4;
        }
    }
}
