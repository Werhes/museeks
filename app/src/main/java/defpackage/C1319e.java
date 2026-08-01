package defpackage;

import android.os.Handler;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1319e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f4047e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4048e;

    public /* synthetic */ C1319e(int i, Function0 function0) {
        this.f4048e = i;
        this.f4047e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.f4048e) {
            case 0:
                return new C2157e((List) this.f4047e.invoke());
            case 1:
                return Float.valueOf(AbstractC10560e.metrica.ad(((Number) this.f4047e.invoke()).floatValue()));
            case 2:
                return Float.valueOf(1.0f - ((Number) this.f4047e.invoke()).floatValue());
            case 3:
                return Boolean.valueOf(((Number) this.f4047e.invoke()).floatValue() < 0.5f);
            case 4:
                try {
                    return (List) this.f4047e.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C13664e.f27089e;
                }
            case 5:
                File file = (File) this.f4047e.invoke();
                if (AbstractC5304e.m1876synchronized('.', file.getName(), BuildConfig.FLAVOR).equals("preferences_pb")) {
                    return file.getAbsoluteFile();
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 6:
                float floatValue = ((Number) this.f4047e.invoke()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                return Float.valueOf(floatValue);
            case 7:
                this.f4047e.invoke();
                return Boolean.TRUE;
            case 8:
                this.f4047e.invoke();
                return Boolean.TRUE;
            case 9:
                Function0 function0 = this.f4047e;
                if (function0 != null) {
                    function0.invoke();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                this.f4047e.invoke();
                return Boolean.TRUE;
            default:
                return (Handler) this.f4047e.invoke();
        }
    }
}
