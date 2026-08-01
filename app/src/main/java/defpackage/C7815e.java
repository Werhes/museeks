package defpackage;

import android.media.MediaRoute2Info;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٕ */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7815e implements InterfaceC2143e, InterfaceC4871e, InterfaceC12504e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f15822e;

    public /* synthetic */ C7815e(int i) {
        this.f15822e = i;
    }

    public /* synthetic */ C7815e(int i, long j, C18177e c18177e) {
        this.f15822e = 20;
    }

    public /* synthetic */ C7815e(C18177e c18177e, int i) {
        this.f15822e = i;
    }

    public /* synthetic */ C7815e(C18177e c18177e, int i, boolean z) {
        this.f15822e = 8;
    }

    public /* synthetic */ C7815e(C18177e c18177e, long j, int i, byte b) {
        this.f15822e = i;
    }

    public /* synthetic */ C7815e(C18177e c18177e, C6913e c6913e, C0807e c0807e, int i) {
        this.f15822e = 23;
    }

    public /* synthetic */ C7815e(C18177e c18177e, C6913e c6913e, C0807e c0807e, int i, byte b) {
        this.f15822e = i;
    }

    public /* synthetic */ C7815e(C18177e c18177e, Object obj, int i) {
        this.f15822e = i;
    }

    public /* synthetic */ C7815e(C18177e c18177e, boolean z, int i) {
        this.f15822e = 6;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info vip(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public Constructor ad() {
        switch (this.f15822e) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC1272e.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC1272e.class).getConstructor(null);
        }
    }

    @Override // defpackage.InterfaceC4871e
    public Object apply(Object obj) {
        C6003e.vip.getClass();
        return C0109e.ad.yandex((AbstractC7939e) obj).getBytes(Charset.forName("UTF-8"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
    
        if (r7.equals("baseAddress") == false) goto L136;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x010c. Please report as an issue. */
    @Override // defpackage.InterfaceC2143e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object appmetrica(android.util.JsonReader r21) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7815e.appmetrica(android.util.JsonReader):java.lang.Object");
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        InterfaceC3190e interfaceC3190e = (InterfaceC3190e) obj;
        switch (this.f15822e) {
            case 5:
                interfaceC3190e.getClass();
                return;
            case 6:
                interfaceC3190e.getClass();
                return;
            case 7:
                interfaceC3190e.getClass();
                return;
            case 8:
                interfaceC3190e.getClass();
                return;
            case 9:
                interfaceC3190e.getClass();
                return;
            case 10:
                interfaceC3190e.getClass();
                return;
            case 11:
                interfaceC3190e.getClass();
                return;
            case 12:
                interfaceC3190e.getClass();
                return;
            case 13:
                interfaceC3190e.getClass();
                return;
            case 14:
                interfaceC3190e.getClass();
                return;
            case 15:
                interfaceC3190e.getClass();
                return;
            case 16:
                interfaceC3190e.getClass();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                interfaceC3190e.getClass();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                interfaceC3190e.getClass();
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                interfaceC3190e.getClass();
                return;
            case 20:
                interfaceC3190e.getClass();
                return;
            case 21:
                interfaceC3190e.getClass();
                return;
            case 22:
                interfaceC3190e.getClass();
                return;
            case 23:
                interfaceC3190e.getClass();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                interfaceC3190e.getClass();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                interfaceC3190e.getClass();
                return;
            default:
                interfaceC3190e.getClass();
                return;
        }
    }
}
