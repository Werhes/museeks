package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import javax.crypto.KeyAgreement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۦٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2997e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7052e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2997e f7043e = new C2997e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C2997e f7040e = new C2997e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2997e f7048e = new C2997e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2997e f7037e = new C2997e(3);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C2997e f7051e = new C2997e(4);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C2997e f7050e = new C2997e(5);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C2997e f7046e = new C2997e(6);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C2997e f7049e = new C2997e(7);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C2997e f7041e = new C2997e(8);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C2997e f7047e = new C2997e(9);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C2997e f7039e = new C2997e(10);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C2997e f7038e = new C2997e(11);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C2997e f7042e = new C2997e(12);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C2997e f7044e = new C2997e(13);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C2997e f7045e = new C2997e(14);

    public /* synthetic */ C2997e(int i) {
        this.f7052e = i;
    }

    public C2997e(C0024e c0024e) {
        this.f7052e = 15;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7052e) {
            case 0:
                return new C3618e(AbstractC6532e.vip(1308617531));
            case 1:
                C5503e c5503e = C5503e.ad;
                InterfaceC8359e interfaceC8359e = (InterfaceC8359e) AbstractC13480e.m3587goto(ServiceLoader.load(InterfaceC8359e.class, InterfaceC8359e.class.getClassLoader()));
                if (interfaceC8359e != null) {
                    return interfaceC8359e;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            case 2:
                return new C3618e(C3618e.vip);
            case 3:
                return new C3618e(C3618e.vip);
            case 4:
                return new C3618e(C3618e.vip);
            case 5:
                AbstractC13270e abstractC13270e = new AbstractC13270e(new C6272e("DefaultBuiltIns"));
                abstractC13270e.metrica();
                return abstractC13270e;
            case 6:
                Set set = C3749e.vip;
                return C13664e.f27089e;
            case 7:
                C17341e c17341e = C17341e.f34028e;
                return (C4053e) C4053e.purchase.getValue();
            case 8:
                InterfaceC8614e[] interfaceC8614eArr = C12794e.billing;
                return Collections.singletonMap(AbstractC16244e.ad, new AbstractC13656e("Deprecated in Java"));
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                C12381e c12381e = C12381e.ad;
                List m3575continue = AbstractC13480e.m3575continue(ServiceLoader.load(InterfaceC14256e.class, InterfaceC14256e.class.getClassLoader()));
                if (m3575continue.isEmpty()) {
                    throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                }
                return m3575continue;
            case 13:
                return "There is more input to consume";
            case 14:
                return Unit.INSTANCE;
            case 15:
                throw null;
            case 16:
                return AlgorithmParameters.getInstance("EC");
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return KeyAgreement.getInstance("ECDH");
            default:
                return KeyFactory.getInstance("EC");
        }
    }
}
