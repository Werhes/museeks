package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2180e {
    public static final C0473e adcel;
    public static final C0473e startapp;
    public final long ad;
    public final C3168e appmetrica;
    public String billing;
    public final C16389e license;
    public final byte[] metrica;
    public long purchase;
    public final int vip;
    public String yandex;

    static {
        C14476e c14476e = AbstractC3362e.f7566e;
        Object[] objArr = {"/", "\\", "../"};
        AbstractC1396e.loadAd(3, objArr);
        startapp = AbstractC3362e.smaato(3, objArr);
        AbstractC3362e.loadAd("../", "/", "\\", "?", "*", "\"", "<", ">", "|", ":", "\u0000", "\n", "\r", "\t", "\f");
        Object[] objArr2 = {"..", ".", "\\", "/"};
        AbstractC1396e.loadAd(4, objArr2);
        AbstractC3362e.smaato(4, objArr2);
        Object[] objArr3 = {"\\"};
        AbstractC1396e.loadAd(1, objArr3);
        AbstractC3362e.smaato(1, objArr3);
        Object[] objArr4 = {"../", "..\\"};
        AbstractC1396e.loadAd(2, objArr4);
        adcel = AbstractC3362e.smaato(2, objArr4);
        AbstractC3362e.loadAd("?", "*", "\"", "|", ":", "\u0000", "\n", "\r", "\t", "\f", "../", "..", new String[0]);
        Object[] objArr5 = {"\\"};
        AbstractC1396e.loadAd(1, objArr5);
        AbstractC3362e.smaato(1, objArr5);
        Object[] objArr6 = {"\\", "/"};
        AbstractC1396e.loadAd(2, objArr6);
        AbstractC3362e.smaato(2, objArr6);
    }

    public C2180e(long j, int i, byte[] bArr, C16389e c16389e, C3168e c3168e) {
        this.ad = j;
        this.vip = i;
        this.metrica = bArr;
        this.license = c16389e;
        this.appmetrica = c3168e;
    }

    public static C2180e metrica(C16389e c16389e, long j) {
        C2180e c2180e = new C2180e(j, 2, null, c16389e, null);
        long j2 = c16389e.f32196e;
        if (j2 <= 0) {
            return c2180e;
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("Payload size must be positive.");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("Payload stream size must be larger than the offset.");
        }
        c2180e.purchase = j2;
        return c2180e;
    }

    public final void ad(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Payload file name should not be null or empty.");
        }
        if (this.vip != 2) {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
        C0473e c0473e = startapp;
        int i = c0473e.f2540e;
        int i2 = 0;
        while (i2 < i) {
            String str2 = (String) c0473e.get(i2);
            i2++;
            if (str.contains(str2)) {
                throw new IllegalArgumentException(AbstractC17861e.subscription("File name ", str, " contains illegal string ", str2, "."));
            }
        }
        this.billing = str;
    }

    public final void vip(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Payload parent folder should not be null or empty.");
        }
        if (this.vip != 2) {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
        C0473e c0473e = adcel;
        int i = c0473e.f2540e;
        int i2 = 0;
        while (i2 < i) {
            boolean contains = str.contains((String) c0473e.get(i2));
            i2++;
            if (contains) {
                throw new IllegalArgumentException("Folder name contains illegal string.");
            }
        }
        this.yandex = str;
    }
}
