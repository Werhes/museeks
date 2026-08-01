package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* renamed from: eَ۟ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10565e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C18214e f20847e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20848e;

    public /* synthetic */ C10565e(C18214e c18214e, int i) {
        this.f20848e = i;
        this.f20847e = c18214e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20848e) {
            case 0:
                List singletonList = Collections.singletonList(AbstractC2518e.ad(this.f20847e.f35660e.amazon(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", BuildConfig.FLAVOR, "WARNING"));
                return singletonList.isEmpty() ? C4590e.f9885e : new C4155e(0, singletonList);
            default:
                return this.f20847e.f35660e.amazon().appmetrica();
        }
    }
}
