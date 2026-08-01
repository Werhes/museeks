package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۨٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10698e extends C7460e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C10698e f21085e = new C7460e(1, AbstractC8230e.class, "printError", "printError(Ljava/lang/Exception;)V", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        if (AbstractC8230e.ad) {
            try {
                String message = exc.getMessage();
                if (message == null) {
                    message = "An occurred in Decompose";
                }
                Log.e("Decompose", message, exc);
            } catch (Exception unused) {
                AbstractC8230e.ad = false;
            }
        }
        return Unit.INSTANCE;
    }
}
