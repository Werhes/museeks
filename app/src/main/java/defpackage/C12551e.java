package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12551e implements InterfaceC2062e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static volatile C12551e f25140e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String[] f25142e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String[] f25143e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String[] f25144e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6327e f25139e = new C6327e(0, 22);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C6327e f25138e = new C6327e(224, 239);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C6327e f25141e = new C6327e(253, 254);

    public C12551e() {
        C6327e c6327e = f25139e;
        String[] strArr = new String[(c6327e.vip - c6327e.ad) + 1];
        this.f25144e = strArr;
        strArr[0] = "Padding (has no meaning)";
        strArr[1] = "End of initial silence";
        strArr[2] = "Intro start";
        strArr[3] = "Main part start";
        strArr[4] = "Outro start";
        strArr[5] = "Outro end";
        strArr[6] = "Verse start";
        strArr[7] = "Refrain start";
        strArr[8] = "Interlude start";
        strArr[9] = "Theme start";
        strArr[10] = "Variation start";
        strArr[11] = "Key change";
        strArr[12] = "Time change";
        strArr[13] = "Momentary unwanted noise (Snap, Crackle & Pop)";
        strArr[14] = "Sustained noise";
        strArr[15] = "Sustained noise end";
        strArr[16] = "Intro end";
        strArr[17] = "Main part end";
        strArr[18] = "Verse end";
        strArr[19] = "Refrain end";
        strArr[20] = "Theme end";
        strArr[21] = "Profanity";
        strArr[22] = "Profanity end";
        C6327e c6327e2 = f25138e;
        String[] strArr2 = new String[(c6327e2.vip - c6327e2.ad) + 1];
        this.f25143e = strArr2;
        strArr2[0] = "Not predefined synch 0";
        strArr2[1] = "Not predefined synch 1";
        strArr2[2] = "Not predefined synch 2";
        strArr2[3] = "Not predefined synch 3";
        strArr2[4] = "Not predefined synch 4";
        strArr2[5] = "Not predefined synch 5";
        strArr2[6] = "Not predefined synch 6";
        strArr2[7] = "Not predefined synch 7";
        strArr2[8] = "Not predefined synch 8";
        strArr2[9] = "Not predefined synch 9";
        strArr2[10] = "Not predefined synch A";
        strArr2[11] = "Not predefined synch B";
        strArr2[12] = "Not predefined synch C";
        strArr2[13] = "Not predefined synch D";
        strArr2[14] = "Not predefined synch E";
        strArr2[15] = "Not predefined synch F";
        C6327e c6327e3 = f25141e;
        String[] strArr3 = new String[(c6327e3.vip - c6327e3.ad) + 1];
        this.f25142e = strArr3;
        strArr3[0] = "Audio end (start of silence)";
        strArr3[1] = "Audio file ends";
    }

    public static C12551e ad() {
        if (f25140e == null) {
            synchronized (C12551e.class) {
                try {
                    if (f25140e == null) {
                        f25140e = new C12551e();
                    }
                } finally {
                }
            }
        }
        return f25140e;
    }

    @Override // defpackage.InterfaceC2062e
    public final String getValue(int i) {
        C6327e c6327e = f25139e;
        if (c6327e.ad(i)) {
            String str = this.f25144e[i - c6327e.ad];
            return str == null ? BuildConfig.FLAVOR : str;
        }
        C6327e c6327e2 = f25138e;
        if (c6327e2.ad(i)) {
            String str2 = this.f25143e[i - c6327e2.ad];
            return str2 == null ? BuildConfig.FLAVOR : str2;
        }
        C6327e c6327e3 = f25141e;
        if (!c6327e3.ad(i)) {
            return BuildConfig.FLAVOR;
        }
        String str3 = this.f25142e[i - c6327e3.ad];
        return str3 == null ? BuildConfig.FLAVOR : str3;
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof */
    public final boolean mo269instanceof(int i) {
        return f25139e.ad(i) || f25138e.ad(i) || f25141e.ad(i);
    }
}
