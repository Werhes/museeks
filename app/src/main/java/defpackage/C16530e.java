package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.adcel;
import androidx.car.app.mopub;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16530e implements InterfaceC2499e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C16530e(adcel adcelVar) {
        this.ad = 2;
        this.vip = adcelVar;
    }

    public /* synthetic */ C16530e(adcel adcelVar, mopub mopubVar, C4891e c4891e, int i) {
        this.ad = i;
        this.vip = c4891e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؙ٘ٓ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eؙ٘ٓ] */
    @Override // defpackage.InterfaceC2499e
    public final InterfaceC6457e ad() {
        int i = this.ad;
        Object obj = this.vip;
        switch (i) {
            case 0:
                C4891e c4891e = (C4891e) obj;
                ?? obj2 = new Object();
                c4891e.ad(new C15132e(c4891e, 2));
                return obj2;
            case 1:
                C4891e c4891e2 = (C4891e) obj;
                ?? obj3 = new Object();
                c4891e2.ad(new C15132e(c4891e2, 0));
                return obj3;
            default:
                adcel adcelVar = (adcel) obj;
                try {
                    int i2 = CarAppMetadataHolderService.f275e;
                    Bundle bundle = adcelVar.getPackageManager().getServiceInfo(new ComponentName(adcelVar, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                    String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
                    if (string == null) {
                        throw new ClassNotFoundException("ResultManager metadata could not be found");
                    }
                    if (Class.forName(string).getConstructor(null).newInstance(null) == null) {
                        return null;
                    }
                    throw new ClassCastException();
                } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                    throw new IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
                }
        }
    }
}
