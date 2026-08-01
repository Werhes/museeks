package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16289e {
    public final Bundle ad;

    public C16289e(Bundle bundle) {
        this.ad = bundle;
    }

    public final HashSet ad() {
        Bundle bundle = this.ad;
        return !bundle.containsKey("allowedPackages") ? new HashSet() : new HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    public final boolean appmetrica() {
        return (TextUtils.isEmpty(license()) || TextUtils.isEmpty(this.ad.getString("name")) || vip().contains(null)) ? false : true;
    }

    public final String license() {
        return this.ad.getString("id");
    }

    public final ArrayList metrica() {
        Bundle bundle = this.ad;
        return !bundle.containsKey("groupMemberIds") ? new ArrayList() : new ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(license());
        sb.append(", groupMemberIds=");
        sb.append(metrica());
        sb.append(", name=");
        Bundle bundle = this.ad;
        sb.append(bundle.getString("name"));
        sb.append(", description=");
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        String string = bundle.getString("iconUri");
        sb.append(string == null ? null : Uri.parse(string));
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", isSystemRoute=");
        sb.append(bundle.getBoolean("isSystemRoute", false));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(vip().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(bundle.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(bundle.getInt("volume"));
        sb.append(", volumeMax=");
        sb.append(bundle.getInt("volumeMax"));
        sb.append(", volumeHandling=");
        sb.append(bundle.getInt("volumeHandling", 0));
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(bundle.getBundle("extras"));
        sb.append(", isValid=");
        sb.append(appmetrica());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Alert.DURATION_SHOW_INDEFINITELY));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(ad().toArray()));
        sb.append(" }");
        return sb.toString();
    }

    public final ArrayList vip() {
        Bundle bundle = this.ad;
        return !bundle.containsKey("controlFilters") ? new ArrayList() : new ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }
}
