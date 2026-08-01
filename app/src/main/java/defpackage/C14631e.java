package defpackage;

import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14631e extends AbstractC5357e {
    public final List adcel;

    public C14631e(Class cls) {
        Object[] declaredMethods = cls.getDeclaredMethods();
        C13834e c13834e = new C13834e(1);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c13834e);
            }
        }
        this.adcel = Arrays.asList(declaredMethods);
    }

    @Override // defpackage.AbstractC5357e
    public final String ad() {
        return AbstractC13480e.m3608try(this.adcel, BuildConfig.FLAVOR, "<init>(", ")V", C7247e.f14822e, 24);
    }
}
