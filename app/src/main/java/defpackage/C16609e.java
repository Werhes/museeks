package defpackage;

import android.os.Build;
import java.util.Collections;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16609e extends AbstractC16234e {
    public final C6571e appmetrica;
    public final /* synthetic */ int license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16609e(String str, int i) {
        super(Unit.class, "/track/async_stat");
        this.license = i;
        switch (i) {
            case 3:
                super(Unit.class, "/track/stat");
                this.appmetrica = new C6571e("PUT", AbstractC10064e.purchase(new C6571e("device_type", "mobile"), new C6571e("device_model", Build.MODEL), new C6571e("device_make", Build.MANUFACTURER), new C6571e("os_version", "Android " + Build.VERSION.SDK_INT + ' ' + Build.VERSION.RELEASE), new C6571e("platform", "android"), new C6571e("data", str)));
                return;
            default:
                this.appmetrica = new C6571e("POST", Collections.singletonMap("data", str));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16609e(String str, boolean z, int i) {
        super(Unit.class, AbstractC5087e.m1746extends("/track/", str, "/dislike"));
        this.license = i;
        switch (i) {
            case 1:
                super(Unit.class, AbstractC5087e.m1746extends("/track/", str, "/like"));
                this.appmetrica = new C6571e(z ? "PUT" : "DELETE", C9139e.f18290e);
                return;
            default:
                this.appmetrica = new C6571e(z ? "PUT" : "DELETE", Collections.singletonMap("source_client", "mix_smart"));
                return;
        }
    }

    @Override // defpackage.AbstractC16234e
    public final C6571e license() {
        switch (this.license) {
            case 0:
                return this.appmetrica;
            case 1:
                return this.appmetrica;
            case 2:
                return this.appmetrica;
            default:
                return this.appmetrica;
        }
    }
}
