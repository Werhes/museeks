package defpackage;

import android.graphics.Color;
import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2840e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f6810e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6811e;

    public /* synthetic */ C2840e(InterfaceC16132e interfaceC16132e, int i) {
        this.f6811e = i;
        this.f6810e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object c12763e;
        String str;
        int i = this.f6811e;
        InterfaceC16132e interfaceC16132e = this.f6810e;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                List list = C13622e.f27026e;
                boolean containsKey = ((C3487e) interfaceC16132e.getValue()).f7758e.containsKey(str2);
                int i2 = Alert.DURATION_SHOW_INDEFINITELY;
                if (containsKey) {
                    try {
                        c12763e = Integer.valueOf(Color.parseColor((String) ((C3487e) interfaceC16132e.getValue()).f7758e.get(str2)));
                    } catch (Throwable th) {
                        c12763e = new C12763e(th);
                    }
                    if (c12763e instanceof C12763e) {
                        c12763e = null;
                    }
                    Integer num = (Integer) c12763e;
                    if (num != null) {
                        i2 = num.intValue();
                    }
                }
                return Integer.valueOf(i2);
            default:
                String str3 = (String) obj;
                List list2 = C13622e.f27026e;
                return (!((C3487e) interfaceC16132e.getValue()).f7758e.containsKey(str3) || (str = (String) ((C3487e) interfaceC16132e.getValue()).f7758e.get(str3)) == null) ? BuildConfig.FLAVOR : str;
        }
    }
}
