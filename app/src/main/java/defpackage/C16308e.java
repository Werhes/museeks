package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16308e extends AbstractC8470e {
    public static final C16308e billing;
    public static final C16308e yandex;
    public final boolean purchase;

    static {
        C16308e c16308e = new C16308e(new int[]{2, 3, 0}, false);
        billing = c16308e;
        int i = c16308e.metrica;
        int i2 = c16308e.vip;
        yandex = (i2 == 1 && i == 9) ? new C16308e(new int[]{2, 0, 0}, false) : new C16308e(new int[]{i2, i + 1, 0}, false);
        new C16308e(new int[0], false);
    }

    public C16308e(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        this.purchase = z;
    }
}
