package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0129e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f1301e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f1302e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1303e;

    public /* synthetic */ C0129e(InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, int i) {
        this.f1303e = i;
        this.f1302e = interfaceC3314e;
        this.f1301e = interfaceC3314e2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.f1303e;
        InterfaceC3314e interfaceC3314e = this.f1301e;
        InterfaceC3314e interfaceC3314e2 = this.f1302e;
        switch (i2) {
            case 0:
                File file = AbstractC14119e.ad;
                MainArtist mainArtist = (MainArtist) interfaceC3314e2.getValue();
                String str = mainArtist != null ? mainArtist.ad : null;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                AbstractC14119e.vip.remove(str);
                AbstractC14119e.metrica();
                interfaceC3314e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                if (interfaceC3314e2.getValue() == null || interfaceC3314e.getValue() == null) {
                    i = 0;
                } else {
                    long Signature = ((InterfaceC0043e) interfaceC3314e2.getValue()).Signature(0L);
                    long j = ((C2152e) interfaceC3314e.getValue()).ad;
                    i = Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (Signature >> 32)) ? Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (Signature & 4294967295L)) ? 1 : 3 : Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (Signature & 4294967295L)) ? 2 : 4;
                }
                return Integer.valueOf(i);
        }
    }
}
