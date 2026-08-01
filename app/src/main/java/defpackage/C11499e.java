package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11499e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f23096e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23097e;

    public /* synthetic */ C11499e(int i, float f) {
        this.f23097e = i;
        this.f23096e = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23097e) {
            case 0:
                C10122e c10122e = (C10122e) obj;
                float appmetrica = C8738e.appmetrica(0.9f, 1.0f, 1.0f - AbstractC3062e.vip(Math.abs(this.f23096e), 0.0f, 1.0f));
                c10122e.advert(appmetrica);
                c10122e.smaato(appmetrica);
                return Unit.INSTANCE;
            case 1:
                C15074e c15074e = (C15074e) obj;
                long j = C3618e.vip;
                if (!C3618e.metrica(j, c15074e.f29850e)) {
                    c15074e.f29841e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    c15074e.f29850e = j;
                }
                List singletonList = Collections.singletonList(new C10810e(C3618e.vip(0.7f, j)));
                if (!singletonList.equals(c15074e.f29839e)) {
                    c15074e.f29841e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    c15074e.f29839e = singletonList;
                }
                if (0.15f != c15074e.f29840e) {
                    c15074e.f29841e |= 64;
                    c15074e.f29840e = 0.15f;
                }
                float f = 25;
                if (!C15765e.vip(f, c15074e.f29845e)) {
                    c15074e.f29841e |= 32;
                    c15074e.f29845e = f;
                }
                InterfaceC6412e interfaceC6412e = c15074e.f29860e;
                C8313e c8313e = C8313e.ad;
                if (!c8313e.equals(interfaceC6412e)) {
                    c15074e.f29860e = c8313e;
                    c15074e.f29841e |= 2;
                }
                if (true != c15074e.f29853e) {
                    c15074e.f29853e = true;
                    c15074e.f29841e |= 1;
                }
                c15074e.f29837e = true;
                C7127e c7127e = new C7127e(AbstractC3734e.vip, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f23096e) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
                if (!c7127e.equals(c15074e.f29843e)) {
                    c15074e.f29841e |= 4096;
                    c15074e.f29843e = c7127e;
                }
                return Unit.INSTANCE;
            case 2:
                ((C10122e) obj).signatures(-this.f23096e);
                return Unit.INSTANCE;
            default:
                C10122e c10122e2 = (C10122e) obj;
                float f2 = this.f23096e;
                float license = AbstractC4229e.license(c10122e2, f2);
                float appmetrica2 = AbstractC4229e.appmetrica(c10122e2, f2);
                c10122e2.smaato(appmetrica2 == 0.0f ? 1.0f : license / appmetrica2);
                c10122e2.admob(AbstractC4229e.license);
                return Unit.INSTANCE;
        }
    }
}
