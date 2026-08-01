package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2139e {
    public int Signature;
    public String ad;
    public int adcel;
    public boolean admob;
    public int advert;
    public int amazon;
    public String appmetrica;
    public boolean billing;
    public String license;
    public float loadAd;
    public Set metrica;
    public int mopub;
    public int purchase;
    public int smaato;
    public boolean startapp;
    public String vip;
    public int yandex;

    public static int ad(int i, int i2, String str, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
