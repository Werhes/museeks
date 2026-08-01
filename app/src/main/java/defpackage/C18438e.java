package defpackage;

import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* renamed from: eۢؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18438e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f36143e;

    public C18438e(boolean z) {
        this.f36143e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C5538e c5538e = (C5538e) obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36143e ? "(raw) " : BuildConfig.FLAVOR);
        sb.append(c5538e);
        return sb.toString();
    }
}
