package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8455e implements InterfaceC5483e, InterfaceC1598e, InterfaceC14187e, InterfaceC9347e, InterfaceC13204e, InterfaceC5808e, InterfaceC4873e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static C8455e f17218e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17224e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C8455e f17217e = new C8455e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C8455e f17220e = new C8455e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C8455e f17216e = new C8455e(18);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C8455e f17223e = new C8455e(19);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C8455e f17222e = new C8455e(20);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C8455e f17219e = new C8455e(21);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C8455e f17221e = new C8455e(22);

    public /* synthetic */ C8455e(int i) {
        this.f17224e = i;
    }

    @Override // defpackage.InterfaceC5483e
    public InterfaceC18147e Signature(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f17224e) {
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(10000L, 68, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(5L, 46, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            default:
                return new Boolean(((Boolean) C8581e.vip.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC17254e.ad;
                C3973e.f8863e.get();
                return Integer.valueOf((int) ((Long) C16868e.ad.billing(-2L, 3, "measurement.test.int_flag").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(3600000L, 12, "measurement.session.engagement_interval").get();
            case 20:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(65536L, 66, "measurement.upload.max_bundle_size").get()).longValue());
            case 21:
                List list6 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(1000L, 70, "measurement.upload.max_events_per_bundle").get()).longValue());
        }
    }

    @Override // defpackage.InterfaceC14187e
    public void inmobi(IOException iOException) {
    }

    @Override // defpackage.InterfaceC5483e
    public void mopub() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC5483e
    public void pro(InterfaceC6347e interfaceC6347e) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        return new C2306e((C3200e) c18464e.ad(C3200e.class), (C6776e) c18464e.ad(C6776e.class), (C2316e) c18464e.ad(C2316e.class));
    }

    @Override // defpackage.InterfaceC14187e
    public void subscription(C4602e c4602e, C11058e c11058e) {
        c11058e.close();
    }

    public String toString() {
        switch (this.f17224e) {
            case 9:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9347e
    public InterfaceC1108e vip(C10872e c10872e) {
        return new C10250e(4, EnumC6092e.f12761e);
    }
}
