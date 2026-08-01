package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486e implements TypeEvaluator {
    public static final C0486e ad = new Object();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f3 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float billing = AbstractC1634e.billing(f3, f2, f, f2);
        float billing2 = AbstractC1634e.billing(pow4, pow, f, pow);
        float billing3 = AbstractC1634e.billing(pow5, pow2, f, pow2);
        float billing4 = AbstractC1634e.billing(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(billing2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(billing3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(billing4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(billing * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
